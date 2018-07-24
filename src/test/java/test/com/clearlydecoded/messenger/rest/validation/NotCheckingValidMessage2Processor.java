/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package test.com.clearlydecoded.messenger.rest.validation;

import com.clearlydecoded.messenger.AbstractMessageProcessor;
import org.springframework.stereotype.Service;

/**
 * {@link NotCheckingValidMessage2Processor} class is used for testing rest controller validation.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
@Service
public class NotCheckingValidMessage2Processor extends
    AbstractMessageProcessor<ValidMessage2, Response> {

  /**
   * Process method WITHOUT @Valid on the message argument.
   */
  @Override
  public Response process(ValidMessage2 message) {
    return new Response("dummy response");
  }
}
