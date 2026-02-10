import java.util.ArrayList;

public class CanAttend {
//magnus huston period 4
	//precondition: has an arraylist of MeetingInterval objects
	//postcondition: returns true if a person can attend all meetings in the arraylist without overlap, false otherwise
	public static boolean canAttend(ArrayList<MeetingInterval> meetings) {
		//your implementation here
        for (int i=0; i<=meetings.size()-1;i++){
            for (int j=0; j<=meetings.size()-1;j++){
				if (meetings.get(i).getStart()<meetings.get(j).getStart()&&meetings.get(i).getEnd()>meetings.get(j).getStart()){
					return false;
				}
			}
        }
		System.out.println(meetings);
		return true; //replace me with actual logic please!
	}
	public static void main(String[] args) {
		ArrayList<MeetingInterval> meet = new ArrayList<MeetingInterval>();
		for(int i =0; i<10; i++) {
			int start = (int)(Math.random()*2399);
			int end = start + ((int)(Math.random()*(2399-start)));
			meet.add(new MeetingInterval(start, end));
		}
		System.out.println(canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");
		//please include additional testing here!
	}
}
