package ms.bng.roommates.details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomMatesController {

	@Autowired
	private RoomMatesService roomMatesService;

	@RequestMapping(method = RequestMethod.GET,value="/roommates")
	public List<RoomMate> getAllRoomMates() {

		return roomMatesService.getAllRoommates();

	}

	@RequestMapping("/roommates/{id}")
	public RoomMate getAllRoomMates(@PathVariable String id) {

		return roomMatesService.getRoomMate(id);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/roommates")
	public String addRoomMate(@RequestBody RoomMate roommate) {

		return roomMatesService.addRoomMate(roommate);

	}

}
