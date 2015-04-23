/**
 * The purpose of the project is being able to successfully send customer information to a mainframe for reporting purposes.
 *
 * <p>
 * The design constraint is to use the classes that the new systems use, namely Company and Website, while at the same time having into consideration that the AS400 uses the archaic LegacyCustomerUtil, which only accepts as parameter a LegacyCustomer. To achieve the goal, I have implemented the Adapter design pattern, which is a Structural GoF pattern to "convert the interface of a class into another interface clients expect". A detail to notice is that in real life a Company can have a List of websites associated to it; for simplification purposes I didn't define their relationship with a Collection, but a with mere Composition. There are multiple Unit Tests in the project. They coverage achieves can be seen in unit-tests-coverage.png (attached). In order to comply with Google code checks, I used CheckStyle's google_checks.xml with minor modifications (see google_checks.xml.png).
 *
 * <p>
 * I have also complied with Sun's code conventions; for this I used CheckStyle's sun_checks.xml also with minor modifications (see sun_checks.xml.png).
 *
 * @author Percy Vega
 * @version 1.0
 * @since 2015-04-20
 */
package com.percyvega.motionpoint;
