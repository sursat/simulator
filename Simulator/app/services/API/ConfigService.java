package services.API;

import com.google.inject.ImplementedBy;
import entities.APIConfigData;
import services.Impl.ConfigServiceImpl;

/**
 * Created by egnaro on 12/12/16.
 */

@ImplementedBy(ConfigServiceImpl.class)
public interface ConfigService {

    void addAPIConfig(APIConfigData apiConfigData);
}
