package ExceptionWRepertoire;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParserRepertoire {
	private FileReader f;
	
	public ParserRepertoire(String nomF){
		try {
			f = new FileReader(nomF);
		}catch(FileNotFoundException fne) {
			System.out.println("nom de fichier introuvable : " + nomF);
		}
		
	}
	
	public RepertoireAmeliore getRA() {
		BufferedReader bReader = new BufferedReader(f);
		String ligne;
		RepertoireAmeliore ra = null;
		try {
			while((ligne = bReader.readLine()) != null) {
				System.out.println("hi");
				ligne.replace("(", ",").replace(")", "");
				String[]  spliting = ligne.split(","); 
				System.out.println(spliting.length);
				if(spliting[0].equals("proprietaire")) {
					ra = new RepertoireAmeliore(new Personne(spliting[1],spliting[2],spliting[3]));
				}else {
					ra.addPersonne(spliting[1],spliting[2], spliting[3]);
				}
				System.out.println(ra);
			}
		}catch(IOException e) {
			System.out.println("Erreur pendant la lecture du fichier");
			
		}finally {
			try {
                if (bReader != null) {
                    bReader.close();
                }
            } catch (IOException ex) {
            	System.out.println("Erreur pendant la fermeture du bufferReader");
            }
			return ra;
		}
	}
}
