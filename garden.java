public class garden {
    public static void main(String[] args) {
        // My measurements
        int length =  12; //  length in meters
        int width =  15;   //  width in meters

        //the area calculation of my garden
        int area = length * width;
        //the calculation of the perimeters
        int perimeter = 2 * (length + width);

        //the final result of my gardens measurements
        System.out.println("Length of the garden: " + length + " meters");
        System.out.println("Width of the garden: " + width + " meters");
        System.out.println("Area of the garden: " + area + " square meters");
        System.out.println("Perimeter of the garden: " + perimeter + " meters");
    }
}
