class Video
{
	void playVideo()
	{
		System.out.println("Playing a basic Vedio.");
	}
}

class Movie4K extends Video
{
	void playVideo()
	{
		System.out.println("Playing Movie in Ultra HD 4K (High Data Usage).");
	
	}
} 

class OfflineVideo extends Video
{
    
    void playVideo() 
    {
        System.out.println("Playing Downloaded Video (No Internet).");
    }
}

class Trailer extends Video
{
	void playVideo()
	{
		System.out.println("Playing Trailer with Auto-Mute enabled.");
	
	}
}


class StreamingApp
{
	public static void main(String[] args) {
		
		Video video;

		System.out.println("---User Clicked on 4K Movie ---");

		video = new Movie4K();
		video.playVideo();

		System.out.println("\n---User Clicked on Trailer ---");

		video = new Trailer();
		video.playVideo();

		System.out.println("\n --- User Playing Offline ---");
		
		video = new OfflineVideo();
		video.playVideo();


	}
}