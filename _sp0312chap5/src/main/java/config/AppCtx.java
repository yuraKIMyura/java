package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberPrinter;
import spring.MemberSummaryPrinter;
import spring.VersionPrinter;
import spring2.MemberRegisterService;

@Configuration
//ComponentScan이 두 개라서 excludeFilters 적용이 제대로 안 되고 있었던 것임!
//@ComponentScan(basePackages = {"spring", "spring2"})
//@ComponentScan(basePackages = {"spring", "spring2"}, excludeFilters = @Filter(type = FilterType.ANNOTATION, classes= {NoProduct.class, ManualBean.class}))
@ComponentScan(basePackages = {"spring", "spring2"}, excludeFilters = @Filter(type=FilterType.REGEX, pattern = "spring\\..*Dao" ))
public class AppCtx {

//	@Bean
//	public MemberDao memberDao() {
//		return new MemberDao();
//	}

//	@Bean
//	public MemberRegisterService memberRegSvc() {
//		return new MemberRegisterService();
//	}

	/**component로 처리할 예정**/
//	@Bean
//	public ChangePasswordService changePwdSvc() {
//		return new ChangePasswordService();
//	}
	
	
//	@Bean
//	@Qualifier("printer")
//	public MemberPrinter memberPrinter() {
//		return new MemberPrinter();
//	}
	
	@Bean
	@Qualifier("printer")
	public MemberPrinter memberPrinter1() {
		return new MemberPrinter();
	}

	//MemberInfoPrinter는 MemberPrinter를 상속받았음. 
	//그래서 추가 설정 없이 getBean하면 오류남!
	//그 추가 설정이라는 게 Qualifier임
	@Bean
	@Qualifier("summaryPrinter")
	public MemberSummaryPrinter memberPrinter2() {
		return new MemberSummaryPrinter();
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter();
	}
	
/**component 처리 예정**/
//	@Bean
//	public MemberInfoPrinter infoPrinter() {
//		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
//		infoPrinter.setPrinter(memberPrinter2());
//		return infoPrinter;
//	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
	
}

