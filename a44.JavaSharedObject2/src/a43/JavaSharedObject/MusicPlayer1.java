package a43.JavaSharedObject;

public class MusicPlayer1 extends Thread {
	int type;
	MusicBox1 mb;

	public MusicPlayer1(int type, MusicBox1 mb) {
		this.type = type;
		this.mb = mb;
	}

	@Override
	public void run() {
		switch(type) {
		case 1: 
			 mb.playMusicA();
			 break;
		case 2: 
			 mb.playMusicB();
			 break;
		case 3: 
			 mb.playMusicC();
			 break;
		}
	}

}
