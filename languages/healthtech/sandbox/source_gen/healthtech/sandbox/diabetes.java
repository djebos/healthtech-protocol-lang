package healthtech.sandbox;

/*Generated by MPS */

import java.util.List;
import java.util.ArrayList;

public class diabetes implements IProtocol {
  private String name = "diabetes";
  private String description = "Diabetes clinic protocol adaptation";
  private String reference = "https://guidelines.moz.gov.ua/documents/3322";
  private List<InputSpec> inputSpecs = new ArrayList<InputSpec>();

  public diabetes() {
    InputSpec inputSpec_xi3ytd_a = new InputSpec(10, 2, MType.PULSE);
    inputSpecs.add(inputSpec_xi3ytd_a);
  }

  @Override
  public void evaluate(List<Measurement> measurements) {

  }


  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public String getReference() {
    return this.reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }
  public List<InputSpec> getInputSpecs() {
    return this.inputSpecs;
  }
  public void setInputSpecs(List<InputSpec> inputSpecs) {
    this.inputSpecs = inputSpecs;
  }
}