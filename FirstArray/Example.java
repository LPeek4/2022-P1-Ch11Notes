public class Example {
    static String Workout[] = new String[45];

    public static void Work() {

        //back
        Workout[0] = "Row Machine x10 min";
        Workout[1] = "Pullups 3x12";
        Workout[2] = "Rope Slams 3x1 min";

        Workout[3] = "Lat Pulldown 4x8";
        Workout[4] = "Barbell Row 4x8";
        Workout[5] = "Single Arm Pulldown 3x12 E.A.";

        Workout[6] = "Deadlift 5x5";
        Workout[7] = "Single Arm Balanced Row 4x12";
        Workout[8] = "Rope Slams 4x1 min";

        //chest
        Workout[9] = "Rope Slams 4x1 min";
        Workout[10] = "Pushups 4x max";
        Workout[11] = "Rope Slams 4x1 min";

        Workout[12] = "Bench Press 4x8";
        Workout[13] = "Cable Flys 4x12";
        Workout[14] = "Pushups 4x max";

        Workout[15] = "Pushups 4x max";
        Workout[16] = "Rope Slams 4x1 min";
        Workout[17] = "Single Arm Dumbbell Press";

        //Legs
        Workout[18] = "Jump Rope 4x2 min";
        Workout[19] = "Running";
        Workout[20] = "Biking";

        Workout[21] = "Squat 4x8";
        Workout[22] = "Quad Extension 4x12";
        Workout[23] = "Hamstring Curl 4x12";

        Workout[24] = "Hex-bar Deadlift 5x5";
        Workout[25] = "Box Jumps 5x6";
        Workout[26] = "Split Squat 5x8 E.L.";

        //Arms
        Workout[27] = "Rope Slams 4x1 min";
        Workout[28] = "Med Ball Slams 4x1 min";
        Workout[29] = "Pushups 4x max";

        Workout[30] = "Bicep Curls 4x12";
        Workout[31] = "Tricep Pushdowns 4x12";
        Workout[32] = "Reverse Curls 4x12";

        Workout[33] = "Rope Slams 4x1 min";
        Workout[34] = "Med Ball Slams 4x1 min";
        Workout[35] = "Pushups 4x max";

        //Shoulders
        Workout[36] = "Rope Slams 4x1 min";
        Workout[37] = "Pushups 4x max";
        Workout[38] = "Med Ball Slams 4x1 min";

        Workout[39] = "Shoulder Press 4x8";
        Workout[40] = "Lateral Raise 4x12";
        Workout[41] = "Face Pulls 4x12";

        Workout[42] = "Rope Slams 4x1 min";
        Workout[43] = "Pushups 4x max";
        Workout[44] = "Single Arm Press 4x8";
    }
    public static void more(String Work) {
        int index;
        for (index = 0; index <= 44; index++) {
            System.out.print(Workout[index] + " ");
        }
    }
}