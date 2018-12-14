package Furniture.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.smodel.runtime.ConstrainedStringDatatypeDescriptor;
import jetbrains.mps.smodel.runtime.ConstrainedStringDatatypeDescriptorImpl;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptComponent = createDescriptorForComponent();
  /*package*/ final ConceptDescriptor myConceptGarage_Project = createDescriptorForGarage_Project();
  /*package*/ final ConceptDescriptor myConceptProject_Component = createDescriptorForProject_Component();
  /*package*/ final ConceptDescriptor myConceptText_Line = createDescriptorForText_Line();
  /*package*/ final ConceptDescriptor myConceptWarehouse = createDescriptorForWarehouse();
  /*package*/ final EnumerationDescriptor myEnumerationMaterial = new EnumerationDescriptor_Material();
  /*package*/ final ConstrainedStringDatatypeDescriptor myCSDatatypeCode_Name = new ConstrainedStringDatatypeDescriptorImpl(0xba1c46a5482045d5L, 0x9b2c6521c394c581L, 0x5418fa6ab58180efL, "Code_Name", "r:e44b24ff-876f-47eb-9c98-9fe11b493d00(Furniture.structure)/6059868634845642991", "[@|#][A-Z][0-9][0-9][0-9]");
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptComponent, myConceptGarage_Project, myConceptProject_Component, myConceptText_Line, myConceptWarehouse);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Component:
        return myConceptComponent;
      case LanguageConceptSwitch.Garage_Project:
        return myConceptGarage_Project;
      case LanguageConceptSwitch.Project_Component:
        return myConceptProject_Component;
      case LanguageConceptSwitch.Text_Line:
        return myConceptText_Line;
      case LanguageConceptSwitch.Warehouse:
        return myConceptWarehouse;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList(myEnumerationMaterial, myCSDatatypeCode_Name);
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForComponent() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Furniture", "Component", 0xba1c46a5482045d5L, 0x9b2c6521c394c581L, 0x61a1f56ddc201198L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e44b24ff-876f-47eb-9c98-9fe11b493d00(Furniture.structure)/7035173945122754968");
    b.version(2);
    b.property("material", 0x61a1f56ddc203470L).type(MetaIdFactory.dataTypeId(0xba1c46a5482045d5L, 0x9b2c6521c394c581L, 0x5418fa6ab58176b5L)).origin("7035173945122763888").done();
    b.property("price", 0x61a1f56ddc203476L).type(PrimitiveTypeId.INTEGER).origin("7035173945122763894").done();
    b.alias("Component");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGarage_Project() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Furniture", "Garage_Project", 0xba1c46a5482045d5L, 0x9b2c6521c394c581L, 0x5418fa6ab58180f0L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e44b24ff-876f-47eb-9c98-9fe11b493d00(Furniture.structure)/6059868634845642992");
    b.version(2);
    b.property("code", 0x61a1f56ddc204540L).type(MetaIdFactory.dataTypeId(0xba1c46a5482045d5L, 0x9b2c6521c394c581L, 0x5418fa6ab58180efL)).origin("7035173945122768192").done();
    b.aggregate("description", 0x61a1f56ddc204551L).target(0xba1c46a5482045d5L, 0x9b2c6521c394c581L, 0x5418fa6ab58180f6L).optional(true).ordered(true).multiple(true).origin("7035173945122768209").done();
    b.aggregate("components", 0x61a1f56ddc204554L).target(0xba1c46a5482045d5L, 0x9b2c6521c394c581L, 0x5418fa6ab5818106L).optional(true).ordered(true).multiple(true).origin("7035173945122768212").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProject_Component() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Furniture", "Project_Component", 0xba1c46a5482045d5L, 0x9b2c6521c394c581L, 0x5418fa6ab5818106L);
    b.class_(false, false, false);
    b.origin("r:e44b24ff-876f-47eb-9c98-9fe11b493d00(Furniture.structure)/6059868634845643014");
    b.version(2);
    b.property("quantity", 0x61a1f56ddc20455dL).type(PrimitiveTypeId.INTEGER).origin("7035173945122768221").done();
    b.associate("component", 0x61a1f56ddc20455aL).target(0xba1c46a5482045d5L, 0x9b2c6521c394c581L, 0x61a1f56ddc201198L).optional(false).origin("7035173945122768218").done();
    b.alias("Project component");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForText_Line() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Furniture", "Text_Line", 0xba1c46a5482045d5L, 0x9b2c6521c394c581L, 0x5418fa6ab58180f6L);
    b.class_(false, false, false);
    b.origin("r:e44b24ff-876f-47eb-9c98-9fe11b493d00(Furniture.structure)/6059868634845642998");
    b.version(2);
    b.property("text", 0x5418fa6ab58180f7L).type(PrimitiveTypeId.STRING).origin("6059868634845642999").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWarehouse() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Furniture", "Warehouse", 0xba1c46a5482045d5L, 0x9b2c6521c394c581L, 0x61a1f56ddc201179L);
    b.class_(false, false, true);
    b.origin("r:e44b24ff-876f-47eb-9c98-9fe11b493d00(Furniture.structure)/7035173945122754937");
    b.version(2);
    b.aggregate("components", 0x61a1f56ddc2034c4L).target(0xba1c46a5482045d5L, 0x9b2c6521c394c581L, 0x61a1f56ddc201198L).optional(true).ordered(true).multiple(true).origin("7035173945122763972").done();
    b.alias("Warehouse");
    return b.create();
  }
}