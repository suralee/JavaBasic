package sura.basic.day10;

import sura.basic.sungjuk.SungJukService;
import sura.basic.sungjuk.SungJukServiceImpl;
import sura.basic.sungjuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
        //SungJukService sisrv = new SungJukServiceImpl();
        SungJukService sjsrv = SungJukServiceImpl.getInstance();

        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);
    }
}
