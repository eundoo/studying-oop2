package day3.abstraction;

public class ReporterApp {

	public static void main(String[] args) {
		
		BasicChart chart1 = new BasicChart();
		chart1.setTitle("1/4분기 매출현황");
		//chart1.setDate(data);
		
		Reporter reporter = new Reporter();
		
		//객체의 조립
		reporter.setChart(chart1);
		
		//보고서 생성
		reporter.createReport();
	}

}
