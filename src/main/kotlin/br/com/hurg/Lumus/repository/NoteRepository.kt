package br.com.hurg.Lumus.repository;

import br.com.hurg.Lumus.model.Note
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository;

@Repository
interface NoteRepository: CrudRepository <Note, Long> {

}


