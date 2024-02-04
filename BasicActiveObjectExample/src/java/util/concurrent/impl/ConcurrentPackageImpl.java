/**
 */
package java.util.concurrent.impl;

import java.JavaPackage;

import java.impl.JavaPackageImpl;

import java.lang.LangPackage;

import java.lang.impl.LangPackageImpl;

import java.util.UtilPackage;

import java.util.concurrent.ConcurrentFactory;
import java.util.concurrent.ConcurrentPackage;
import java.util.concurrent.Semaphore;

import java.util.impl.UtilPackageImpl;

import model.BasicActiveObjectExample.BasicActiveObjectExamplePackage;

import model.BasicActiveObjectExample.impl.BasicActiveObjectExamplePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcurrentPackageImpl extends EPackageImpl implements ConcurrentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semaphoreEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see java.util.concurrent.ConcurrentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcurrentPackageImpl() {
		super(eNS_URI, ConcurrentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConcurrentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcurrentPackage init() {
		if (isInited) return (ConcurrentPackage)EPackage.Registry.INSTANCE.getEPackage(ConcurrentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConcurrentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConcurrentPackageImpl theConcurrentPackage = registeredConcurrentPackage instanceof ConcurrentPackageImpl ? (ConcurrentPackageImpl)registeredConcurrentPackage : new ConcurrentPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasicActiveObjectExamplePackage.eNS_URI);
		BasicActiveObjectExamplePackageImpl theBasicActiveObjectExamplePackage = (BasicActiveObjectExamplePackageImpl)(registeredPackage instanceof BasicActiveObjectExamplePackageImpl ? registeredPackage : BasicActiveObjectExamplePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(registeredPackage instanceof JavaPackageImpl ? registeredPackage : JavaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		LangPackageImpl theLangPackage = (LangPackageImpl)(registeredPackage instanceof LangPackageImpl ? registeredPackage : LangPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(registeredPackage instanceof UtilPackageImpl ? registeredPackage : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theConcurrentPackage.createPackageContents();
		theBasicActiveObjectExamplePackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theConcurrentPackage.initializePackageContents();
		theBasicActiveObjectExamplePackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConcurrentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcurrentPackage.eNS_URI, theConcurrentPackage);
		return theConcurrentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemaphore() {
		return semaphoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrentFactory getConcurrentFactory() {
		return (ConcurrentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		semaphoreEClass = createEClass(SEMAPHORE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(semaphoreEClass, Semaphore.class, "Semaphore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ConcurrentPackageImpl
