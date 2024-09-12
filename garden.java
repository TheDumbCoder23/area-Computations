public class garden {
    public static void main(String[] args) {
        // Jhann jover
        int length, width, area, perimeter;
        // My measurements
        length = 12;
        width =  15;  //  width in meters

        //the area calculation of my garden
        area = length * width;
        //the calculation of the perimeters
        perimeter = 2 * (length + width);

        //the final result of my gardens measurements
        System.out.println("Length of the garden: " + length + " meters");
        System.out.println("Width of the garden: " + width + " meters");
        System.out.println("Area of the garden: " + area + " square meters");
        System.out.println("Perimeter of the garden: " + perimeter + " meters");
    }
}
