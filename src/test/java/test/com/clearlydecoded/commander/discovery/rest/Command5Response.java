package test.com.clearlydecoded.commander.discovery.rest;

import com.clearlydecoded.commander.CommandResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Command5Response implements CommandResponse {

  private String greetingResponse;

}
