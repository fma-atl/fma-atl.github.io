package fma.interpreter.atl

import fma.interpreter.utils.EmfCompareInJson
import maude4j.MaudeDaemon
import moment2.registry.EmfMetamodelRegistry
import spock.lang.Specification
import static fma.interpreter.utils.TestProperties.fmaCodePath
import fma.interpreter.atl.FmaAtlInterpreter

class ModelChecker_LeaderElection_LTL extends Specification {
	
	
	
	public "leader_3processes_noSymmetry_eLeader"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/Network.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/3processes.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/Network.ecore'
		
		String systemSpecPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/leader.atl'
		String propSpecPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/leader-props.atl'
		String ltlFormula = '[] [] <> eLeader'
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		interpreter.debug_ = true
		
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
				
		boolean decision = interpreter.modelCheckLTL(
			systemSpecPath,
			propSpecPath,
			ltlFormula,
			
			sourceMetamodelPath,
			'Root',
			sourceModelPath,
			targetMetamodelPath,
			'Root',
			['Network', 'Network'], // aliases used for models in module declaration
			resolveTempClasses,
			ExecutionMode.INPLACE
		)
		
		File outputFile = new File('src/test/resources/fma/atl/inplace/leader/noSymmetry/module.txt')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.verificationModule
		outputFile << interpreter.modelCheckCmd
		
		expect: decision==true
	}
	
	public "leader_3processes_noSymmetry_mLeader"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/Network.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/3processes.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/Network.ecore'
		
		String systemSpecPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/leader.atl'
		String propSpecPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/leader-props.atl'
		String ltlFormula = '~ <> [] mLeader'
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		interpreter.debug_ = true
		
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
				
		boolean decision = interpreter.modelCheckLTL(
			systemSpecPath,
			propSpecPath,
			ltlFormula,
			
			sourceMetamodelPath,
			'Root',
			sourceModelPath,
			targetMetamodelPath,
			'Root',
			['Network', 'Network'], // aliases used for models in module declaration
			resolveTempClasses,
			ExecutionMode.INPLACE
		)
		
		File outputFile = new File('src/test/resources/fma/atl/inplace/leader/noSymmetry/module.txt')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.verificationModule
		outputFile << interpreter.modelCheckCmd
		
		expect: decision==true
	}
	
	
	
	
}
