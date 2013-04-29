package org.ros.model.ros_package.dsl.validation;

import org.eclipse.xtext.validation.Check;
import org.ros.model.ros.RosPackage;

public class RosPackageJavaValidator extends AbstractRosPackageJavaValidator {

	@Check
	public void checkEntityNameStartsWithCapital(RosPackage entity) {
		if (!Character.isUpperCase(entity.getName().charAt(0))) {
			warning("Name should start with a capital letter",
					RosPackage.Literals.PACKAGE__NAME);
		}
	}

	/*
	 * @Check public void checkPropertyNameStartsWithCapital(Property property)
	 * { if (!Character.isLowerCase(property.getName().charAt(0))) {
	 * warning("Name should start with a lower case letter",
	 * EntitiesPackage.Literals.PROPERTY__NAME); } }
	 * 
	 * @Check public void noNameCollision(Property property) {
	 * noNameCollision(property, property.eContainer().eContents(),
	 * EntitiesPackage.Literals.PROPERTY__NAME); }
	 * 
	 * @Check public void noNameCollision(Entity entity) {
	 * noNameCollision(entity, entity.eContainer().eContents(),
	 * EntitiesPackage.Literals.PROPERTY__NAME); }
	 * 
	 * private void noNameCollision(EObject eObject, List<EObject> siblings,
	 * EStructuralFeature nameFeature) { String name = (String)
	 * eObject.eGet(nameFeature); for (EObject sibling : siblings) { if
	 * (name.equals(sibling.eGet(nameFeature)) && eObject != sibling) {
	 * error("Duplicate name", nameFeature); } } }
	 * 
	 * @Check public void simplePropertyTypeIsSet(SimpleProperty s) { if
	 * (s.getType() == null) { error("Property must have a type",
	 * EntitiesPackage.Literals.PROPERTY__NAME); } }
	 */
}
