package zyk.spring;

class TextEditor {

    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
        System.out.println("Inside TextEditor Constructor");
    }

    public void spellCheck() {
        spellChecker.checkSpell();
    }

}
