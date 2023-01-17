public class EmailDirector {

    private EmailBuilder _builder;

    public EmailDirector(EmailBuilder builder) {
        _builder = builder;
    }

    public void ChangeBuilder(EmailBuilder builder) {
        _builder = builder;
    }

    public String makeEmailApplyForInternship() {
        _builder.reset();
        _builder.addressAMadam("Els");
        _builder.talkAboutMe("tim", "HZ");
        _builder.showInterest("Goldi");
        _builder.tellHowToContactMe();
        _builder.sayThanks();

        return _builder.getEmail();
    }
}
