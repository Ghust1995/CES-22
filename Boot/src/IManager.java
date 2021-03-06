import java.util.List;


public interface IManager 
{
	List<Hyperlink> Search(String keywords);
	void Add(Hyperlink hyperlink);
	void Save();
	void Edit(Hyperlink from, Hyperlink to);
	void RemoveByName(String name);
}
