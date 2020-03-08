import java.util.ArrayList;
import java.util.List;

public class SoulGift {

	private final static int[] FLOOR_NUM = { 13, 18, 38 };
	private static List<String> giftList = new ArrayList<String>() {
		private static final long serialVersionUID = 6725736279177602046L;
		{
			this.add("口红");
			this.add("香水");
			this.add("腮红");
		}
	};

	public static void main(String[] args) {
		soulGiftRandom();
	}

	public static void soulGiftRandom() {
		final double r = Math.random();
		for (int i = 0; i < FLOOR_NUM.length; i++) {
			final int n = (int) (r * (FLOOR_NUM.length - i));
			String gift = giftList.get(n);
			if (gift == null) {
				continue;
			}
			giftList.remove(n);
			System.out.println(FLOOR_NUM[i] + "层 => " + gift);
		}
	}
}
