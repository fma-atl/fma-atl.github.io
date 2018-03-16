package fma.interpreter.atl

import fma.interpreter.utils.EmfCompareInJson

import maude4j.MaudeDaemon
import moment2.registry.EmfMetamodelRegistry
import spock.lang.Specification
import fma.interpreter.atl.FmaAtlInterpreter
import fma.interpreter.atl.AtlInterpreter.SearchModality

import static fma.interpreter.utils.TestProperties.fmaCodePath

class ModelChecker_Invariants_Test extends Specification {
	
	public "leader_3processes_noSymmetry_mLeader"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/Network.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/3processes.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/Network.ecore'
		String targetModelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/output-3processes.xmi'
		String oracleModelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/output-3processes.xmi'
		
		String systemSpecPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/leader.atl'
		String propSpecPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/leader-props.atl'
		String invariantName = 'mLeader'
		
		int bound = 1
		SearchModality modality = SearchModality.ZERO_OR_MORE
		
		File outputModelFile = new File(targetModelPath)
		if (outputModelFile.exists()) outputModelFile.delete()
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
				
		boolean decision = interpreter.modelCheckInvariant(
			systemSpecPath,
			propSpecPath,
			invariantName,
			bound,
			modality,
			
			sourceMetamodelPath,
			'Root',
			sourceModelPath,
			targetMetamodelPath,
			'Root',
			['Network', 'Network'], // aliases used for models in module declaration
			targetModelPath,
			resolveTempClasses,
			ExecutionMode.INPLACE
		)
		
		File outputFile = new File('src/test/resources/fma/atl/inplace/leader/noSymmetry/module.txt')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.searchCmd
		
		expect: decision==true
	}
	
	public "leader_3processes_noSymmetry_counterexample"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/Network.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/3processes.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/Network.ecore'
		String targetModelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/output-3processes.xmi'
		String oracleModelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/output-3processes.xmi'
		
		String systemSpecPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/leader.atl'
		String propSpecPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/leader-invariant-test.atl'
		String invariantName = 'mLeader'
		
		int bound = -1
		SearchModality modality = SearchModality.ONE
		
		File outputModelFile = new File(targetModelPath)
		if (outputModelFile.exists()) outputModelFile.delete()
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
				
		boolean decision = interpreter.modelCheckInvariant(
			systemSpecPath,
			propSpecPath,
			invariantName,
			bound,
			modality,
			
			sourceMetamodelPath,
			'Root',
			sourceModelPath,
			targetMetamodelPath,
			'Root',
			['Network', 'Network'], // aliases used for models in module declaration
			targetModelPath,
			resolveTempClasses,
			ExecutionMode.INPLACE
		)
		
		File outputFile = new File('src/test/resources/fma/atl/inplace/leader/noSymmetry/module.txt')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.searchCmd
		
		expect: decision==false
	}
}
