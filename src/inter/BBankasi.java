package inter;

public class BBankasi {

    private String bankaAdi;
    private String terminalId;
    private String password;


    public BBankasi(String bankaAdi, String terminalId, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı Ip: " + ipAddress);
        System.out.println("Makina Ip : " + this.hostIpAddress);
        System.out.println(this.bankaAdi + "bağlanıldı");
        return true;
    }

    public boolean payment(double price, String cardNumber, String date, String cvc){

        System.out.println("Bankadan cevap beklaniyor");

        System.out.println("İşlem başarılı oldu");
        return true;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getterminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminal_id) {
        this.terminalId = terminal_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
