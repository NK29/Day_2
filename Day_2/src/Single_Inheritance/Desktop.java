package Single_Inheritance;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Desktop Size:1920*1680");
	}

	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();
		desktop.desktopSize();
		desktop.computerModel();

	}

}
