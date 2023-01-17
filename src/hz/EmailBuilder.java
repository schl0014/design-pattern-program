public interface EmailBuilder {

    void addressASir(String name);

    void addressAMadam(String name);

    void toUnknown(String name);

    void talkAboutMe(String name, String university);

    void showInterest(String company);

    void tellHowToContactMe();

    void sayThanks();

    void reset();

    String getEmail();
}
