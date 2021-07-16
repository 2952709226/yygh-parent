import com.jmit.yygh.ServiceHospApplication;
import com.jmit.yygh.mapper.HospitalSetMapper;
import com.jmit.yygh.service.impl.HospServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ServiceHospApplication.class)
public class AA {

    @Autowired
    HospServiceImpl hospService ;

    @Autowired
    HospitalSetMapper hospitalSetMapper;

    @Test
    void test(){
        System.out.println(hospitalSetMapper.selectList(null));
    }
}
