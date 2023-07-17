package hello.typeconverter.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.DefaultConversionService;

public class ConversionServiceTest {

    @Test
    void conversionService() {

        // 등록
        DefaultConversionService conversionService = new DefaultConversionService();
        conversionService.addConverter(new IntegerToStringConverter());
        conversionService.addConverter(new StringToIntegerConverter());
        conversionService.addConverter(new IpPortToStringConverter());
        conversionService.addConverter(new StringToIntegerConverter());

        // 사용
        Integer result = conversionService.convert("10", Integer.class);
        System.out.println("result = " + result);
        Assertions.assertThat(result).isEqualTo(10);
    }
}
