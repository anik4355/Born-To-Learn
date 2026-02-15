class MostContainerWithWater {
    public int maxArea(int[] height) {
        int water = 0;
        int h1 = 0;
        int h2 = height.length - 1;
        while (h1 < h2) {
            int min = Math.min(height[h1], height[h2]);
            int contain = min * (h2 - h1);
            if (contain > water) {
                water = contain;
            }
            if (height[h1] < height[h2]) {
                h1++;
            } else {
                h2--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        MostContainerWithWater water = new MostContainerWithWater();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int ans = water.maxArea(height
        );
        System.out.println(ans);
    }
}