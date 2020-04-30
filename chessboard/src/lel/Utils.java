package lel;

import java.awt.Color;
import java.util.Random;

public class Utils {
	//生成随机的颜色
	public static Color getColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }
}
