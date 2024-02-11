package LoopExercise;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println("Paint Bucket Required: " + getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println("Paint Bucket Required: " + getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println("Paint Bucket Required: " + getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println("----------------------------------------");
        System.out.println("Paint Bucket Required: " + getBucketCount(-3.4, 2.1, 1.5));
        System.out.println("Paint Bucket Required: " + getBucketCount(3.4, 2.1, 1.5));
        System.out.println("Paint Bucket Required: " + getBucketCount(7.25, 4.3, 2.35));
        System.out.println("----------------------------------------");
        System.out.println("Paint Bucket Required: " + getBucketCount(3.4, 1.5));
        System.out.println("Paint Bucket Required: " + getBucketCount(6.26, 2.2));
        System.out.println("Paint Bucket Required: " + getBucketCount(3.26, 0.75));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }
        double areaOfWall = width * height;
        int bobRequirePaintBucket = (int) Math.ceil((double) (areaOfWall / areaPerBucket));
        int buyPaintBucket = bobRequirePaintBucket - extraBuckets;
        return buyPaintBucket;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        double areaOfWall = width * height;
        int bobRequirePaintBucket = (int) Math.ceil((double) (areaOfWall / areaPerBucket));
        return bobRequirePaintBucket;
    }

    public static int getBucketCount(double areaOfWall, double areaPerBucket) {
        if ((areaOfWall <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        int bobRequirePaintBucket = (int) Math.ceil((double) (areaOfWall / areaPerBucket));
        return bobRequirePaintBucket;
    }
}
