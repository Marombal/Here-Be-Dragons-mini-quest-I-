package nomefixe;
import java.util.Scanner;
import java.util.Random;

class dragonquest {
	public static void main(String args[]) {
		
		// Initial configuration of the map
		String map[][] = {
				{"X","X","X","X","X","X","X","X","X","X"},
				{"X","H"," "," "," "," "," "," "," ","X"},
				{"X"," ","X","X"," ","X"," ","X"," ","X"},
				{"X","D","X","X"," ","X"," ","X"," ","X"},
				{"X"," ","X","X"," ","X"," ","X"," ","X"},
				{"X"," "," "," "," "," "," ","X"," ","E"},
				{"X"," ","X","X"," ","X"," ","X"," ","X"},
				{"X"," ","X","X"," ","X"," ","X"," ","X"},
				{"X","K","X","X"," "," "," "," "," ","X"},
				{"X","X","X","X","X","X","X","X","X","X"},
		};
		int Hx = 1, Hy = 1;
		int Dx = 1, Dy = 3;
		int Hxaux, Hyaux;
		int key = 0;
		int x2 = 1, y2 = 5;
		// Draw of the map
		// draw_map(map);
		
		Random random = new Random();
		boolean pos = random.nextBoolean();
		//System.out.println(pos);
		
		
		// Asking the user an input and saving it
		System.out.print("Enter single-character commands to move the main character in 4 possible directions (up, down, left, right):\n");
		while(true) {
			draw_map(map);
			Scanner scan = new Scanner(System.in);
			String play = scan.nextLine();
			//System.out.println(play);
			switch(play) {
				case "up":
					System.out.print("up\n");
					Hxaux = Hx;
					Hyaux = Hy - 1;
					if(map[Hyaux][Hxaux]=="X") {
						System.out.print("Wall\n");
					}
					if(map[Hyaux][Hxaux]==" ") {
						System.out.print("Empty\n");
						map[Hy][Hx] = " ";
						Hx = Hxaux;
						Hy = Hyaux;
						map[Hy][Hx] = "H";
					}
					if(map[Hyaux][Hxaux]=="E") {
						if(key == 0) {
							System.out.print("The door is closed\n");
						}
						else {
							System.out.print("WIN\nWIN\nWIN\nWIN\n");
							map[Hy][Hx] = " ";
							Hx = Hxaux;
							Hy = Hyaux;
							map[Hy][Hx] = "H";
							draw_map(map);
							return;
						}
					}
					if(map[Hyaux][Hxaux]=="K") {
						System.out.print("KEY\n");
						/*
						map[Hy][Hx] = " ";
						Hx = Hxaux;
						Hy = Hyaux;
						map[Hy][Hx] = "H";
						*/
						map[Hy][Hx] = " ";
						if(pos==true) {
							Hx = 1;
							Hy = 1;
							map[Hy][Hx] = "H";
						}
						else {
							Hx = x2;
							Hy = y2;
							map[Hy][Hx] = "H";
						}
						map[Hyaux][Hxaux] = " ";
						key = 1;
					}
					if(Hx == Dx) {
						if((Hy == Dy + 1)||(Hy == Dy - 1)) {
							System.out.print("\nGAME OVER\n");
							return;
						}
					}
					break;
				case "down":
					System.out.print("down\n");
					Hxaux = Hx;
					Hyaux = Hy + 1;
					if(map[Hyaux][Hxaux]=="X") {
						System.out.print("Wall\n");
					}
					if(map[Hyaux][Hxaux]==" ") {
						System.out.print("Empty\n");
						map[Hy][Hx] = " ";
						Hx = Hxaux;
						Hy = Hyaux;
						map[Hy][Hx] = "H";
					}
					if(map[Hyaux][Hxaux]=="E") {
						if(key == 0) {
							System.out.print("The door is closed\n");
						}
						else {
							System.out.print("WIN\nWIN\nWIN\nWIN\n");
							map[Hy][Hx] = " ";
							Hx = Hxaux;
							Hy = Hyaux;
							map[Hy][Hx] = "H";
							draw_map(map);
							return;
						}
					}
					if(map[Hyaux][Hxaux]=="K") {
						System.out.print("KEY\n");
						/*map[Hy][Hx] = " ";
						Hx = Hxaux;
						Hy = Hyaux;
						map[Hy][Hx] = "H";*/
						map[Hy][Hx] = " ";
						if(pos==true) {
							Hx = 1;
							Hy = 1;
							map[Hy][Hx] = "H";
						}
						else {
							Hx = x2;
							Hy = y2;
							map[Hy][Hx] = "H";
						}
						map[Hyaux][Hxaux] = " ";
						key = 1;
					}
					if(Hx == Dx) {
						if((Hy == Dy + 1)||(Hy == Dy - 1)) {
							System.out.print("\nGAME OVER\n");
							return;
						}
					}
					break;
				case "left":
					System.out.print("left\n");
					Hxaux = Hx - 1;
					Hyaux = Hy;
					if(map[Hyaux][Hxaux]=="X") {
						System.out.print("Wall\n");
					}
					if(map[Hyaux][Hxaux]==" ") {
						System.out.print("Empty\n");
						map[Hy][Hx] = " ";
						Hx = Hxaux;
						Hy = Hyaux;
						map[Hy][Hx] = "H";
					}
					if(map[Hyaux][Hxaux]=="E") {
						if(key == 0) {
							System.out.print("The door is closed\n");
						}
						else {
							System.out.print("WIN\nWIN\nWIN\nWIN\n");
							map[Hy][Hx] = " ";
							Hx = Hxaux;
							Hy = Hyaux;
							map[Hy][Hx] = "H";
							draw_map(map);
							return;
						}
					}
					if(map[Hyaux][Hxaux]=="K") {
						System.out.print("KEY\n");
						/*map[Hy][Hx] = " ";
						Hx = Hxaux;
						Hy = Hyaux;
						map[Hy][Hx] = "H";*/
						map[Hy][Hx] = " ";
						if(pos==true) {
							Hx = 1;
							Hy = 1;
							map[Hy][Hx] = "H";
						}
						else {
							Hx = x2;
							Hy = y2;
							map[Hy][Hx] = "H";
						}
						map[Hyaux][Hxaux] = " ";
						key = 1;
					}
					if(Hx == Dx) {
						if((Hy == Dx + 1)||(Hy == Dx - 1)) {
							System.out.print("\nGAME OVER\n");
							return;
						}
					}
					break;
				case "right":
					System.out.print("right\n");
					Hxaux = Hx + 1;
					Hyaux = Hy;
					if(map[Hyaux][Hxaux]=="X") {
						System.out.print("Wall\n");
					}
					if(map[Hyaux][Hxaux]==" ") {
						System.out.print("Empty\n");
						map[Hy][Hx] = " ";
						Hx = Hxaux;
						Hy = Hyaux;
						map[Hy][Hx] = "H";
					}
					if(map[Hyaux][Hxaux]=="E") {
						if(key == 0) {
							System.out.print("The door is closed\n");
						}
						else {
							System.out.print("WIN\nWIN\nWIN\nWIN\n");
							map[Hy][Hx] = " ";
							Hx = Hxaux;
							Hy = Hyaux;
							map[Hy][Hx] = "H";
							draw_map(map);
							return;
						}
					}
					if(map[Hyaux][Hxaux]=="K") {
						System.out.print("KEY\n");
						/*map[Hy][Hx] = " ";
						Hx = Hxaux;
						Hy = Hyaux;
						map[Hy][Hx] = "H";*/
						map[Hy][Hx] = " ";
						if(pos==true) {
							Hx = 1;
							Hy = 1;
							map[Hy][Hx] = "H";
						}
						else {
							Hx = x2;
							Hy = y2;
							map[Hy][Hx] = "H";
						}
						map[Hyaux][Hxaux] = " ";
						key = 1;
					}
					if(Hx == Dx) {
						if((Hy == Dy + 1)||(Hy == Dy - 1)) {
							System.out.print("\nGAME OVER\n");
							return;
						}
					}
					break;
				case "exit":
					System.out.print("Thanks for playing\n");
					return;
				default: 
					System.out.print("Enter a valid play\n");
			}
		}
		
	}
	
	public static void draw_map(String map[][]) {
		System.out.print("\n");
		for(int i = 0 ; i<10 ; i++) {
			System.out.print("\n");
			for(int k = 0 ; k<10; k++) {
				System.out.print(map[i][k]);
			}
		}
		System.out.print("\n\n");
	}
}
