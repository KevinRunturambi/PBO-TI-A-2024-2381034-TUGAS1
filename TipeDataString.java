public class TipeDataString {
    public static void main(String[] args) {
        // Perbedaan primitive dan non primitive

        // null

        String firstName = "Kevin";
        String lastName = "Runturambi";

        // Concat
        //  String fullName = firstName + lastName;
          String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);

    }
}
