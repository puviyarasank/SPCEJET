package utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extendreport {
	public static ExtentReports extendreport() {

		
		File reportpath = new File("C:\\Users\\PUVI\\eclipse-workspace\\SpiceJet\\Reports\\extendreports.html");
		ExtentSparkReporter extend = new ExtentSparkReporter(reportpath);
		extend.config().setReportName("SPICEJET automation report");
		extend.config().setDocumentTitle("SPICEJET AUTOMATION TESTING");
		ExtentReports report = new ExtentReports();
		report.attachReporter(extend);
		return report;

	}

}
