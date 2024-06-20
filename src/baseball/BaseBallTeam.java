package baseball;

public class BaseBallTeam {
    // フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;
    
    // 引数なしコンストラクタ
    public BaseBallTeam() {
    }
    
    // 引数ありコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getWin() {
        return this.win;
    }
    
    public void setWin(int win) {
        this.win = win;
    }
    
    public int getLose() {
        return this.lose;
    }
    
    public void setLose(int lose) {
        this.lose = lose;
    }
    
    public int getDraw() {
        return this.draw;
    }
    
    public void setDraw(int draw) {
        this.draw = draw;
    }
    
    // 計算
    public double getRate() {
        double rate = (double) win / (win + lose);
        return rate;
    }
    
    // 出力
    public void report() {
        System.out.println(getName() + "の2022年の成績は" + getWin() + "勝" + getLose() + "敗" + getDraw() + "分、勝率は" + getRate() + "です。");
       
    }
}
