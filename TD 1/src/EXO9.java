import java.util.Scanner;

public class EXO9 {

	public static void main(String[] args) {
		int hd,  ha,  md, ma, dh, dm, sd, sa, ds, Jour_en_seconde;
		
		do {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("entrer heure de d�part en heure, minute et seconde  ");
		hd = scan1.nextInt();
		md = scan1.nextInt();
		sd = scan1.nextInt();
		}
		while (hd < 0 &&  md < 0 || md > 60 && sd < 0 || sd> 60);
		
		do {
		Scanner scan2 = new Scanner(System.in);
		System.out.println("entrer heure d'arriv�e en heure minute et seconde  ");
		ha = scan2.nextInt();
		ma = scan2.nextInt();
		sa = scan2.nextInt();
		}
		while (ha < 0 && ma < 0 || ma > 60 && sd < 0 || sd > 60 );
		
		sd = sd + (hd*3600) + (md*60);
		sa = sa + (ha*3600) + (ma*60); 
		
		if (ha < hd) {
			
			// convertir 24h en seconde
					
			Jour_en_seconde = 24 * 3600 ;  
			sa = sa + Jour_en_seconde ;

		}
		ds = sa - sd ;
		dh = ds / 3600 ;
		dm = ds % 3600 / 60;
		System.out.printf("la dur�e de vol est :  " + dh + "h : " + dm +" mn");
		


	}

}
