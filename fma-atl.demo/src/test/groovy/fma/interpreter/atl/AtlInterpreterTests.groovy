package fma.interpreter.atl

import fma.interpreter.utils.EmfCompareInJson
import maude4j.MaudeDaemon
import moment2.registry.EmfMetamodelRegistry
import spock.lang.Specification
import fma.interpreter.atl.FmaAtlInterpreter
import static fma.interpreter.utils.TestProperties.fmaCodePath

class AtlInterpreterTests extends Specification {
	
	public "testORM_resolveTemp_Package2Database_ResolveTemp"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/orm/resolveTemp/Class.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/orm/resolveTemp/cd.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/orm/resolveTemp/Relational.ecore'
		String targetModelPath = 'src/test/resources/fma/atl/orm/resolveTemp/output-model-small.xmi'
		String oracleModelPath = 'src/test/resources/fma/atl/orm/resolveTemp/output-atl.xmi'
		
		String trafoPath = 'src/test/resources/fma/atl/orm/resolveTemp/Package2Database_ResolveTemp.atl'
		
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		
		String[] resolveTempClasses = ['metamodel("CD") ! cid("DataType")']
				
		interpreter.eval(
			trafoPath,
			sourceMetamodelPath,
			'NamedElt',
			sourceModelPath,
			targetMetamodelPath,
			'RootElt',
			['CD', 'Relational'], // aliases used for models in module declaration
			targetModelPath,
			resolveTempClasses
		)
		
		File outputFile = new File('src/test/resources/fma/atl/orm/resolveTemp/module.txt')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.trafoCmd
		
		EmfCompareInJson comparator =  new EmfCompareInJson(fmaCodePath,targetMetamodelPath)
		boolean result = comparator.compareEmfModels(targetModelPath, oracleModelPath)
		expect: result==true
	}

	
	public "test_refining_model"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/refining/Class.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/refining/model.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/refining/Class.ecore'
		String targetModelPath = 'src/test/resources/fma/atl/refining/output-model.xmi'
		String oracleModelPath = 'src/test/resources/fma/atl/refining/output-atl-model.xmi'
		
		String trafoPath = 'src/test/resources/fma/atl/refining/Private2Public.atl'
		
		File outputModelFile = new File(targetModelPath)
		if (outputModelFile.exists()) outputModelFile.delete()
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
				
		interpreter.eval(
			trafoPath,
			sourceMetamodelPath,
			'Package',
			sourceModelPath,
			targetMetamodelPath,
			'Package',
			['Class', 'Class'], // aliases used for models in module declaration
			targetModelPath,
			resolveTempClasses,
			ExecutionMode.REFINING
		)
		
		File outputFile = new File('src/test/resources/fma/atl/refining/module.txt')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.trafoCmd
		
		EmfCompareInJson comparator =  new EmfCompareInJson(fmaCodePath,targetMetamodelPath)
		boolean result = comparator.compareEmfModels(targetModelPath, oracleModelPath)
		expect: result==true
	}
	
	public "test_refining_model2"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/refining/Class.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/refining/model2.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/refining/Class.ecore'
		String targetModelPath = 'src/test/resources/fma/atl/refining/output-model2.xmi'
		String oracleModelPath = 'src/test/resources/fma/atl/refining/output-atl-model2.xmi'
		
		String trafoPath = 'src/test/resources/fma/atl/refining/Private2Public.atl'
		
		File outputModelFile = new File(targetModelPath)
		if (outputModelFile.exists()) outputModelFile.delete()
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
				
		interpreter.eval(
			trafoPath,
			sourceMetamodelPath,
			'Package',
			sourceModelPath,
			targetMetamodelPath,
			'Package',
			['Class', 'Class'], // aliases used for models in module declaration
			targetModelPath,
			resolveTempClasses,
			ExecutionMode.REFINING
		)
		
		File outputFile = new File('src/test/resources/fma/atl/refining/module.txt')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.trafoCmd
		
		EmfCompareInJson comparator =  new EmfCompareInJson(fmaCodePath,targetMetamodelPath)
		boolean result = comparator.compareEmfModels(targetModelPath, oracleModelPath)
		expect: result==true
	}
	
	public "test_refining_model3"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/refining/Class.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/refining/model3.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/refining/Class.ecore'
		String targetModelPath = 'src/test/resources/fma/atl/refining/output-model3.xmi'
		String oracleModelPath = 'src/test/resources/fma/atl/refining/output-atl-model3.xmi'
		
		String trafoPath = 'src/test/resources/fma/atl/refining/Private2Public.atl'
		
		File outputModelFile = new File(targetModelPath)
		if (outputModelFile.exists()) outputModelFile.delete()
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
				
		interpreter.eval(
			trafoPath,
			sourceMetamodelPath,
			'Package',
			sourceModelPath,
			targetMetamodelPath,
			'Package',
			['Class', 'Class'], // aliases used for models in module declaration
			targetModelPath,
			resolveTempClasses,
			ExecutionMode.REFINING
		)
		
		File outputFile = new File('src/test/resources/fma/atl/refining/module.txt')
		if (outputFile.exists()) outputFile.delete()
		
		outputFile << interpreter.metamodelModule
		outputFile << interpreter.trafoCmd
		
		EmfCompareInJson comparator =  new EmfCompareInJson(fmaCodePath,targetMetamodelPath)
		boolean result = comparator.compareEmfModels(targetModelPath, oracleModelPath)
		expect: result==true
	}
	

	public "test_inplace_leader_3processes_noSymmetry"() {
		String sourceMetamodelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/Network.ecore'
		String sourceModelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/3processes.xmi'
		
		String targetMetamodelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/Network.ecore'
		String targetModelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/output-3processes.xmi'
		String oracleModelPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/output-3processes.xmi'
		
		String trafoPath = 'src/test/resources/fma/atl/inplace/leader/noSymmetry/leader.atl'
		
		File outputModelFile = new File(targetModelPath)
		if (outputModelFile.exists()) outputModelFile.delete()
		
		MaudeDaemon md = new MaudeDaemon();
		EmfMetamodelRegistry registry = new EmfMetamodelRegistry();
		AtlInterpreter interpreter = new AtlInterpreter(md, fmaCodePath, registry );
		
		String[] resolveTempClasses = ['metamodel("") ! cid("")']
				
		interpreter.eval(
			trafoPath,
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
		outputFile << interpreter.trafoCmd
		
		EmfCompareInJson comparator =  new EmfCompareInJson(fmaCodePath,targetMetamodelPath)
		boolean result = comparator.compareEmfModels(targetModelPath, oracleModelPath)
		expect: result==true
	}
}
