package tws.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.entity.Employee;
import tws.entity.PackingLot;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@MybatisTest
public class PackinglotMapperTest {
    @Autowired
    private PackingLotMapper packinglotMapper;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {

        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @After
    public void tearDown() throws Exception {
        JdbcTestUtils.deleteFromTables(jdbcTemplate, "employee");
    }

    @Test
    public void shouldFetchEmployee() {
        //given 已经有值不用传入参数了

        //when
        List<PackingLot> packingLots = packinglotMapper.queryAll();
        //then
        assertEquals(1, packingLots.size());
    }
}
