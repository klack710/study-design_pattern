public abstract class AbstractPrint {
    public abstract void firstLine();
    public abstract void print(String str);
    public abstract void lastLine();

    // 基本の動作をここで記述
    public void templatePrint(String str) {
        this.firstLine();
        this.print(str);
        this.lastLine();
    }
}