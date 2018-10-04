import java.util.ArrayList;

public class HashTaggery {
	public String maxTag(String[] tags, String[] messages) {
		ArrayList<String> hashtags = new ArrayList<String>();
		for (int i = 0; i < tags.length; i++) {
			if (tags[i].charAt(0) == '#') {
				hashtags.add(tags[i]);
			}
		}
		int tagged = 0;
		for (String s : messages) {
			String[] words = s.split(" ");
			boolean isTagged = false;
			for (String str : words) {
				if (isIn(str, hashtags)) {
					isTagged = true;
				}
			}
			if (isTagged) {
				tagged = tagged + 1;
			}
		}
		if ((double)tagged / (double)messages.length >= 0.75) {
			return "tagged";
		}
		return "missed";
	}

	private boolean isIn(String str, ArrayList<String> hashtags) {
		for (int i = 0; i <  hashtags.size(); i++) {
			if (str.equals(hashtags.get(i))) {
				return true;
			}
		}
		return false;
	}
}