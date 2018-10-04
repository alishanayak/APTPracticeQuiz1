
public class Test {

	public static void main(String[] args) {
		HashTaggery h = new HashTaggery();
		String[] tags = {"#map", "#tree", "#linkedlist"};
		String[] messages = {"we have a #tree, we have a #map", "we have a #linkedlist and a #catnap", "we grow flowers and we grow #trees", "we #map stars, we don't sneeze" };
		System.out.println(h.maxTag(tags, messages));
		
	}

}
