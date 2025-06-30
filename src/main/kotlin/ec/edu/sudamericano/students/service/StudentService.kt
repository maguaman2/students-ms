package ec.edu.sudamericano.students.service

import ec.edu.sudamericano.students.entity.Student
import ec.edu.sudamericano.students.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(private val studentRepository: StudentRepository) {

    fun list ():List<Student>{
        return studentRepository.findAll()
    }
}