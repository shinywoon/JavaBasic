package a43.JavaSharedObject;

public class MusicBoxExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicBox1 mb = new MusicBox1();
		MusicPlayer1 mp1 = new MusicPlayer1(1,mb);
		MusicPlayer1 mp2 = new MusicPlayer1(2,mb);
		MusicPlayer1 mp3 = new MusicPlayer1(3,mb);
		
		mp1.start();
		mp2.start();
		mp3.start();
	}

}
