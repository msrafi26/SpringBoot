package ms.bng.roommates.details;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RoomMatesService {

	private List<RoomMate> roomMates = new ArrayList<>(Arrays.asList(new RoomMate("Chanti", "ChantiD", "GHATTU", "", "", "", "0.0"),
			new RoomMate("Rafi", "RafiS", "BKK", "", "", "", "0.0"),
			new RoomMate("Ramana", "RamanaK", "KNG", "", "", "", "0.0"),
			new RoomMate("Ramesh", "RameshB", "GSM", "", "", "", "0.0"),
			new RoomMate("Venkatesh", "VenkateshS", "GHATTU", "", "", "", "0.0")

	));

	public List<RoomMate> getAllRoommates() {

		return roomMates;

	}

	public RoomMate getRoomMate(String id) {

		return roomMates.stream().filter(f -> f.getId().equals(id)).findFirst().get();

	}

	public String addRoomMate(RoomMate roomMate) {
		roomMates.add(roomMate);
		return "New Room Mate added";
	}
}
