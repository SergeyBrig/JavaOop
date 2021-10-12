public class Block {

    private int width;
    private int length;
    private int height;

    public Block(int[] array) {
        this.width = array[0];
        this.length = array[1];
        this.height = array[3];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
    public int getVolume() {
        return getWidth() * getLength() * getHeight();
    }

    public int getSurfaceAria() {
        return getWidth() * getHeight() * 2 +
                getWidth() * getLength() * 2
                + getHeight() * getLength() * 2;
    }
}
