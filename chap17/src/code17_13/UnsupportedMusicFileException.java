package code17_13;

public class UnsupportedMusicFileException extends Exception {
  // エラーメッセージを受け取るコンストラクタ
  public UnsupportedMusicFileException(String msg) {
    super(msg);
  }
}
