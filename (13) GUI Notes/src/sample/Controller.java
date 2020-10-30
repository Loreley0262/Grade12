package sample;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.*;

public class Controller {
    public TextField txtNumber;
    public Label lblNumber;
    public ListView<Person> listPersons = new ListView<>();
    public Button btnAddPerson;
    public TextField txtName;

    public void btnAddNums(ActionEvent actionEvent) {
        int nom = Integer.parseInt(txtNumber.getText()) + Integer.parseInt(lblNumber.getText());
        lblNumber.setText(Integer.toString(nom));
    }

    public void btnAddPpl(ActionEvent actionEvent) {
        ObservableList<Person> people = new ObservableList<Person>() {
            @Override
            public void addListener(ListChangeListener<? super Person> listener) {

            }

            @Override
            public void removeListener(ListChangeListener<? super Person> listener) {

            }

            @Override
            public boolean addAll(Person... elements) {
                return false;
            }

            @Override
            public boolean setAll(Person... elements) {
                return false;
            }

            @Override
            public boolean setAll(Collection<? extends Person> col) {
                return false;
            }

            @Override
            public boolean removeAll(Person... elements) {
                return false;
            }

            @Override
            public boolean retainAll(Person... elements) {
                return false;
            }

            @Override
            public void remove(int from, int to) {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Person> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Person person) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Person> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Person> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Person get(int index) {
                return null;
            }

            @Override
            public Person set(int index, Person element) {
                return null;
            }

            @Override
            public void add(int index, Person element) {

            }

            @Override
            public Person remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Person> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Person> listIterator(int index) {
                return null;
            }

            @Override
            public List<Person> subList(int fromIndex, int toIndex) {
                return null;
            }

            @Override
            public void addListener(InvalidationListener listener) {

            }

            @Override
            public void removeListener(InvalidationListener listener) {

            }
        };
        people.add(new Person(Integer.parseInt(txtNumber.getText()), txtName.getText()));
        listPersons.setItems(people);
        txtName.setText(null);
        txtNumber.setText(null);
    }
}
