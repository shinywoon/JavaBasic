package a43.JavaSharedObject;

public class MusicBoxExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicBox mb = new MusicBox();
		MusicPlayer mp1 = new MusicPlayer(1,mb);
		MusicPlayer mp2 = new MusicPlayer(2,mb);
		MusicPlayer mp3 = new MusicPlayer(3,mb);
		
		mp1.start();
		mp2.start();
		mp3.start();
	}

}
