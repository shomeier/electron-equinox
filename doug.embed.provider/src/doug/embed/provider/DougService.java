package doug.embed.provider;

import doug.embed.services.IDougService;

public class DougService implements IDougService {

	@Override
	public String sayHi() {
		return "Hi from DougService.\n This is true Java OSGi Service speaking here.\n Houston we got no problem at all !!!";
	}

}
