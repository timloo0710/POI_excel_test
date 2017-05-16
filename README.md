# POI_excel_test
將資料庫資料寫到excel的儲存格測試

jdbc 連 mysql 的測試。

因為公司引用一個古老的客製 早期版本的poi ，沒有soruce的jar。
測試一下和一般的apache poi的差異。

重點是要即時產生excel output。

目前的測流程是 編譯(mvn package)，copy .class檔，到tomcat 相對應的 目錄下，
由網頁驅動java bean 的方式 ，讓 .class檔 輸出 excel ，另存檔案到本機，才看得到excel的內容，
要看到輸出的內容太耗時，故測試一個在main裏可即時寫到excel的方式。

mvn clean compile exec:java  執行main
