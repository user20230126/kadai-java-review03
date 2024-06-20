package baseball;

public class Review03 {
    
    public static void main(String[] args) {
        BaseBallTeam tokyo = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4); // 東京ヤクルトスワローズ
        BaseBallTeam yokohama = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2); // 横浜DeNAベイスターズ 
        BaseBallTeam hanshin = new BaseBallTeam("阪神タイガース", 68, 71, 4); // 阪神タイガース
        BaseBallTeam yomiuri = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3); // 読売ジャイアンツ
        BaseBallTeam hiroshima = new BaseBallTeam("広島東洋カープ", 66, 74, 3); // 広島東洋カープ
        BaseBallTeam chunichi = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2); // 中日ドラゴンズ
        
        tokyo.report();
        yokohama.report();
        hanshin.report();
        yomiuri.report();
        hiroshima.report();
        chunichi.report();
    }

}
